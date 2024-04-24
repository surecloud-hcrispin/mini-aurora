// scripts.js
document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/entity')
        .then(response => response.json())
        .then(data => {
            document.getElementById('content').innerText = data.message;
        })
        .catch(error => {
            console.error('Error fetching data:', error);
        });
});