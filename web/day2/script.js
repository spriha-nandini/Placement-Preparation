function calculateGrade(){
let marks = document.getElementById("marks").value;
console.log(marks);
if(marks >= 90 && marks<=100){
document.getElementById("results").innerText="Grade: A";
}else if(marks>=75 && marks <=89){
    document.getElementById("results").innerText="Grade: B";
}
else if(marks>=60 && marks<=74){
    document.getElementById("results").innerText="Grade: C";
}
else if(marks>=50 && marks<=59){
    document.getElementById("results").innerText="Grade: D";
}
else if(marks>=0 && marks<=49){
    document.getElementById("results").innerText="Grade: F";
}else{
    document.getElementById("results").innerText="Invalid Input";
}
}