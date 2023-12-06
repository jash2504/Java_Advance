if (typeof (EventSource) !== "undefined") {
    var source = new EventSource("http://localhost:8080/WebSocketDemoProject/api/v1/sse-path");

    source.onmessage = function (evt) {
        document.getElementById("message").innerText += evt.data + "\n"
    };

    source.addEventListener("employee", function (event) {
        document.getElementById("employee").innerText += event.data + "\n"

    });
} else {
    document.getElementById("message").innerText = "Sorry! Your browser doesn't support SSE";

}