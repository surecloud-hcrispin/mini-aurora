import React, { useState } from "react";
import logo from "./logo.svg";
import "./App.css";

function App() {
    const [message, setMessage] = useState("ID Lookup");
    const [apiResponse, setApiResponse] = useState(null);
    const [isLoading, setIsLoading] = useState(false);

    const handleSubmit = async (e) => {
        e.preventDefault();
        setIsLoading(true);

        try {
            const response = await fetch("http://localhost:8080/api/response/", {
                method: "GET",
                headers: {
                    "Content-Type": "application/json",
                },
                // body: JSON.stringify({ message }),
            });

            if (!response.ok) {
                throw new Error("Network response was not ok.");
            }

            const data = await response.json();
            setApiResponse(data);
        } catch (error) {
            console.error("Error fetching data:", error.message);
            setApiResponse(null); // reset response state on error
        } finally {
            setIsLoading(false);
        }
    };

    return (
        <div className="App">
            <header className="App-header">
                <img src={logo} className="App-logo" alt="logo" />
                <p>
                    Edit <code>src/App.js</code> and save to reload.
                </p>

                <form onSubmit={handleSubmit}>
          <textarea
              placeholder="Message"
              value={message}
              onChange={(e) => setMessage(e.target.value)}
          />
                    <button type="submit" disabled={isLoading}>
                        {isLoading ? "Loading..." : "Lookup"}
                    </button>
                </form>

                {apiResponse && (
                    <div>
                        <h2>API Response:</h2>
                        <pre>{JSON.stringify(apiResponse, null, 2)}</pre>
                    </div>
                )}

                <a
                    className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Add more features...
                </a>
            </header>
        </div>
    );
}

export default App;