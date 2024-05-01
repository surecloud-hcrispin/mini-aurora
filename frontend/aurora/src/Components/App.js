import React, { useState } from "react";
import logo from "../logo.svg";
import "../App.css";
import { fetchData } from "./api";

function App() {
    const [message, setMessage] = useState("");
    const [apiResponse, setApiResponse] = useState(null);
    const [isLoading, setIsLoading] = useState(false);
    const [selectedOption, setSelectedOption] = useState("response");

    const options = ["response", "entity", "view"];

    const handleSubmit = async (e) => {
        e.preventDefault();
        setIsLoading(true);

        try {
            const data = await fetchData(message, selectedOption);
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
                <div  className="form-group">

                
                    <textarea
                        placeholder="ID (Blank for all)"
                        value={message}
                        onChange={(e) => setMessage(e.target.value)}
                    />
                </div>
                    <select
                        value={selectedOption}
                        onChange={(e) => setSelectedOption(e.target.value)}
                    >
                        {options.map((option, index) => (
                            <option key={index} value={option}>
                                {option}
                            </option>
                        ))}
                    </select>

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