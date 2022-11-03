// write code here, dont change anything in HTML and css files 
// refer to id's mentioned in html files carefully
// Follow the exact column order for tables,for eg: name should be filled under "name" column 
// we are using form here, make sure you are using "submit" eventListener , or else you will get 0 marks
document.querySelector("form").addEventListener("submit", perform);

function perform(){
    event.preventDefault();
    
 let a =document.querySelector("#image").value;
 let b=document.querySelector("#name").value;
 let c=document.querySelector("#batch").value;
 let d=document.querySelector("#dsa").value;
 let e=document.querySelector("#cs").value;
 let f=document.querySelector("#coding").value;
 


let row=document.createElement("tr");
let col1=document.createElement("td");
let pictur=document.createElement("img");
pictur.setAttribute("src", a);
col1.append(pictur);

let col2=document.createElement("td");
col2.innerText=b;

let col3=document.createElement("td");
col3.innerText=c;
let col4=document.createElement("td");
col4.innerText=d;
let col5=document.createElement("td");
col5.innerText=e;
let col6=document.createElement("td");
col6.innerText=f;
let col7=document.createElement("td");

let obtainerMarks=Number(d)+Number(e)+Number(f);
let totalMarks=30;
let marksObtained =(obtainerMarks/totalMarks)*100;
console.log(marksObtained);

col7.innerText=marksObtained;
let col8=document.createElement("td");
if(marksObtained>50){
   
    col8.innerText="regular";
    col8.style.color="green";
}else{
    col8.innerText="async";
    col8.style.color="red";
}

let col9=document.createElement("td");
col9.innerText="Delete";
col9.style.backgroundColor="red";
col9.addEventListener("click", deleted)
 
row.append(col1,col2,col3,col4,col5,col6,col7,col8,col9);


document.querySelector("tbody").append(row);


}
function deleted(event){
    event.target.parentNode.remove();

}