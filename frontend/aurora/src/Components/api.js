export async function fetchData(message) {
    let url = "http://localhost:8080/api/response"
    if(message !== ""){
        url += "/"+ message;
    }
    const response = await fetch(url, {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        },
        // body: JSON.stringify({ message }),
    });

    if (!response.ok) {
        throw new Error("Network response was not ok.");
    }

    return await response.json();
}