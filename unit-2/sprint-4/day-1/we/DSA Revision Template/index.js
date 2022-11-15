
document.querySelector("form").addEventListener("submit",perform);
let arrObj=JSON.parse(localStorage.getItem("queData"))||[];
displayTb(arrObj)
window.addEventListener("load", function(){
    displayTb(arrObj);
})
// if(localStorage.getItem("queData")==null){
//     arrObj=[];
// }else{
//     arrObj=JOIN.parse(localStorage.getItem("qetData"));
// }
console.log(arrObj)
function perform(event){
    event.preventDefault();
    let obj=  {
     titleQue: document.querySelector("#title").value,
     linkQue: document.querySelector("#link").value,
     diffQue: document.querySelector("#difficulty").value
   };
   arrObj.push(obj);
   displayTb(arrObj);
   localStorage.setItem("queData",JSON.stringify(arrObj));
}

  function displayTb(arrObj){
      document.querySelector("tbody").innerHTML="";
      arrObj.forEach(function(elem){
        let row=document.createElement("tr");
        let col1=document.createElement("td");
        col1.innerText=elem.titleQue;
        let col2=document.createElement("td");
        col2.innerText=elem.linkQue;
        let col3=document.createElement("td");
        col3.innerText=elem.diffQue;
        let col4=document.createElement("td");
        if(elem.diff=="Easy"){
            col4.innerText="NO";
        }else {
            col4.innerText="Yes";
        }
        let col5=document.createElement("td");
        col5.innerText="delete";
        col5.style.backgroundColor="red";
        col5.addEventListener("click",func);
    
        row.append(col1,col2,col3,col4,col5);
        document.querySelector("tbody").append(row);
       })
    
    
    }

    
  
function func(event){
    event.target.parentNode.remove();
}