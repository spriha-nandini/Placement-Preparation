function addtask(){

    let task = document.getElementById("task").value;

    console.log(task);

    let li = document.createElement("li");

    li.innerText = task;

    let list = document.getElementById("tasklist");

    list.appendChild(li);

}