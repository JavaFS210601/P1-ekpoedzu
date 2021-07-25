
//Let create Maanager input function

const url = 'http://localhost:8081/P1-ekpoedzu/' 
document.getElementById('filterReimbursementUnresolved').addEventListener('click', filterReimbursementsUnresolvedFunc);
document.getElementById('filterReimbursementAccepted').addEventListener('click', filterReimbursementsAcceptedFunc);
document.getElementById('filterReimbursementDeclined').addEventListener('click', filterReimbursementDeclinedFunc);
document.getElementById('acceptDenyButton').addEventListener('click', updateReimbursementFunc);

//this function will get all reimbursement from our Java server
async function getReimbursementsFunc() { //async returns a promise (which fetch returns)

    
    let response = await fetch(url + 'getEmployeeReimbursements', {credentials: "include"});

    console.log(response);

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object

    
        //now, I want to put each avenger into my table
        for(let ers_reimbursement of data) { //for every reimbursement in the data variable/object

            console.log(ers_reimbursement); //just for debug, print the reimbursement in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the fiel
            cell.innerHTML = ers_reimbursement.reimb_id; 
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the reimbursement model
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

            document.getElementById("reimbursementBody").appendChild(row);
           
        }
    }
}

async function filterReimbursementUnresolvedFunc() { //async returns a promise (which fetch returns)

    //await makes the async functions wait until the promise returns with the fetched data
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

            if (cell8.innerHTML == 1)
            {
                document.getElementById("ReimbursementBody").appendChild(row);
            }
        }
    }
}

async function filterReimbursementsAcceptedFunc() { //async returns a promise (which fetch returns)

   
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

            if (cell8.innerHTML == 2)
            {
                document.getElementById("reimbursement").appendChild(row);
            }
           
        }
    }
}

async function filterReimbursementDeclinedFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our avenger data
    //await makes the async functions wait until the promise returns with the fetched data
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

            if (cell8.innerHTML == 3)
            {
                document.getElementById("reimbursementsBody").appendChild(row);
            }
           
        }
    }
}

//this function will send the user-inputted login credentials to the server (For Employees)
async function updateReimbursementFunc() {

    //get the user inputs for the login
    let reimbursement_ID = document.getElementById("reimbursement_ID").value; 
    let result = document.getElementById("result").value; 

    let reimb_json = {
        reimb_id:reimbursement_ID,
        reimb_status_id:result
    }

    console.log(reimb_json);

    let response = await fetch(url + "acceptDenyReimbursement", {

        method: "POST", //send as a POST request
        body: JSON.stringify(reimb_json), //turn into JSON
        credentials: "include" //this will ensure that the cookie is captured
                             
    });

    console.log(response.status);

    //control flow based on success or failed login
    if(response.status === 200) {
        //this will wipe our login row, and welcome the user
        document.getElementById("reimbursement_ID").value="Success";
        document.getElementById("result").value="Success";
    } else {
        document.getElementById("typeID").innerText="Reimbursement Creation Failed";
    }

}











