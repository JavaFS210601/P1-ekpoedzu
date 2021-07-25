const url = 'http://localhost:8081/P1-Kpoedzu/';
document.getElementById('ReimbursementsButton').addEventListener('click', getReimbursementFunc);
document.getElementById("createReimbursementButton").addEventListener('click', createReimbursementButtonFunc);
//so when this button gets clicked, the function called assembleFunc will run

async function getReimbursementFunc() { //async returns a promise (which fetch returns)

    let response = await fetch(url + 'getEmployeeReimbursements', {credentials: "include"});

    console.log(response);

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object


        //now, I want to put each avenger into my table
        for(let ers_reimbursement of data) { //for every avenger in the data variable/object

            console.log(ers_reimbursement); //just for debug, print the avenger in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = ers_reimbursement.reimb_id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the avenger model
            let cell2 = document.createElement("td");
            cell2.innerHTML = ers_reimbursement.reimb_amount;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = ers_reimbursement.reimb_submitted;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = ers_reimbursement.reimb_resolved;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = ers_reimbursement.reimb_description;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = ers_reimbursement.reimb_author;
            row.appendChild(cell6);

            let cell7 = document.createElement("td");
            cell7.innerHTML = ers_reimbursement.reimb_resolver;
            row.appendChild(cell7);

            let cell8 = document.createElement("td");
            cell8.innerHTML = ers_reimbursement.reimb_status_id;
            row.appendChild(cell8);

            let cell9 = document.createElement("td");
            cell9.innerHTML = ers_reimbursement.reimb_type_id;
            row.appendChild(cell9);


            document.getElementById("ReimbursementBody").appendChild(row);
           L
        }
    }
}

//this function will send the user-inputted login credentials to the server (For Employees)
async function createReimbursementButtonFunc() {

    //get the user inputs for the login
    let reimb_type_idVal = document.getElementById("typeID").value; 
    let reimb_amountVal = document.getElementById("requestAmount").value; 
    let reimb_descriptionVal = document.getElementById("descriptionText").value; 


    let reimb_json = {
        reimb_type_id:reimb_type_idVal ,
        reimb_amount:reimb_amountVal,
        reimb_description:reimb_descriptionVal
    }

    console.log(reimb_json);

    
    let response = await fetch(url + "addErs_Reimbursement_Request", {

        method: "POST", //send as a POST request
        body: JSON.stringify(reimb_json), //turn into JSON
        credentials: "include" 
    });

    console.log(response.status);

    //control flow based on success or failed login
    if(response.status === 200) {
        //this will wipe our login row, and welcome the user
        document.getElementById("typeID").value="Success";
        document.getElementById("requestAmount").value="Success";
        document.getElementById("descriptionText").value="Success";
 
    } else {
        document.getElementById("typeID").innerText="Reimbursement Creation Failed";
    }

}
































//let send the user inputed loging credentials to the server for employee
document.getElementById;
    document.getElementById('getReimbursementsButton').addEventListener('click')

//this function will send the user-inputted login credentials to the server (For Employees)
async function createReimbursementButtonFunc() {
     
    //get the user inputs for the employee login

    let reimb_type_idValue = document.getElementById("typeID").value; 
    let reimb_amountValue = document.getElementById("requestAmount").value; 
    let reimb_descriptionValue = document.getElementById("descriptionText").value; 
    let reimb_json = {
        reimb_type_id:reimb_type_idValue ,
        reimb_amount:reimb_amountValue,
        reimb_description:reimb_descriptionValue
    }

    console.log(reimb_json);

    // set up my fetch request to the server
    
    let response = await fetch(url + "addErs_Reimbursement_Request", {

        method: "POST", //send as a POST request
        body: JSON.stringify(reimb_json), //turn into JSON
        credentials: "include" //this will ensure that the cookie is captured
                              
        
    });

    console.log(response.status);

    //control flow based on success or failed login
    if(response.status === 200) {

        //To sucessfully log in
        document.getElementById("typeID").value="Success";
        document.getElementById("requestAmount").value="Success";
        document.getElementById("descriptionText").value="Success";

    } else {
        document.getElementById("typeID").innerText="Reimbursement Creation Failed";
    }

}
document.getviewInfo()
document.getElementById("getviewDiv").addEventListener('click');
		
//this function will send the user-inputted login credentials to the server (For Employees)
async function createInfoButtonFunc() {

    if(this.readyState ===4 && this.status ===200){
        var ans = JSON.parse(this.responseText);
        document.getElementById("viewDiv").innerHTML = JSON.stringify(ans);
    }else{
        document.getElementById("viewDiv").innerHTML = "Unexpected Error"
    }
}

    console.log(view_json);

    // set up my fetch request to the server
    
    let response = await fetch(url + "addUserInfo", {

        method: "POST", //send as a POST request
        body: JSON.stringify(info_json), //turn into JSON
        credentials: "include" //this will ensure that the cookie is captured
                              
        
    });

    console.log(response.status);

    //control flow based on success or failed login
    if(response.status === 200) {

        //To sucessfully log in

function updateInfo(){
    let username = document.getElementById("updateUsername").value;
    let email = document.getElementById("updateEmail").value;
    let template = {
        userName: userN,
        email: email
    }
        if(this.readyState ===4 && this.status ===200){
			var div = document.getElementById('div2');
			div.innerHTML = "User Updated";
        }else{
			var div = document.getElementById('div2');
			div.innerHTML = "Error";
	
		}
    }
}