const url = 'http://localhost:8081/P1-Kpoedzu/';
document.getElementById('getReimbursementButton').addEventListener('click', assembleFunc);
async function reimbursementFunc() { 
    let response = await fetch(url + 'ers_reimbursement', {credentials: "include"});
    
    console.log(response);

    if(response.status === 200) { //if the request is successful...
        console.log(response); 

        let data = await response.json(); //get the JSON data from the response, turn it into JS object
    }

        //now, I want to put each reimbursement into my table
        for(let reimbursement of data) { //for every reimbursement in the data variable/object

            console.log(reimbursement); //just for debug, print the reimbursement in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = reimbursement.reimb_id; //fill the cell with reimursement  data
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the reimbursement model
            let cell2 = document.createElement("td");
            cell2.innerHTML = reim;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = reimbursement.reimb_amount;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = reimbursement.reimb_submitted;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = reimbursement.reimb_resolved;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_description;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_description;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_description;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_description;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_receipt;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_author;
            row.appendChild(cell6);
            let cell6 = document.createElement("td");

            cell6.innerHTML = reimbursement.reimb_resolver;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_status_id;
            row.appendChild(cell6);

            let cell6 = document.createElement("td");
            cell6.innerHTML = reimbursement.reimb_type_id;
            row.appendChild(cell6);
        }
            //if the reimbursemnt  has a reimbursement status, just fill the cell with the status Id name
            if(reimbursement.reimbursementstatus_fk != null){
                console.log("Get Reimbursement Status")
                let cell7 = document.createElement("td");
                cell7.innerHTML =reimbursement.reimbursementstatus_fk.reimbursementstatusId;
                row.appendChild(cell7);
            } else { //otherwise, still append the cell but leave it empty
                let cell7 = document.createElement("td");
                row.appendChild(cell7);
            }
// Let's do the same for the reimbursement type
            if(reimbursement.reimbursementype_fk != null){
                console.log("Get Reimbursement type")
                let cell7 = document.createElement("td");
                cell7.innerHTML =reimbursement.reimbursementtype_fk.reimbursementtypeId;
                row.appendChild(cell7);

            } else { //otherwise, still append the cell but leave it empty
                let cell7 = document.createElement("td");
                row.appendChild(cell7);
            }



            document.getElementById("ReimbursementBody").appendChild(row);
            //so the variable "row" we created alllll the way at the top of the for loop 
            //will be appended to our empty table body in the HTML

        }

document.getElementById('getReimbursementStatusButton').addEventListener('click', reimbursementstatusFunc);
async function reimbursementstatusFunc() { 
let response = await fetch(url + 'ers_reimbursement_status', {credentials: "include"});

console.log(response);

if(response.status === 200) { //if the request is successful...
    console.log(response); //just to see what comes back for debug

    let data = await response.json(); //get the JSON data from the response, turn it into JS object

}
    //now, I want to put each reimbursement into my table
    for(let reimbursementstatus of data) { //for every avenger in the data variable/object

        console.log(reimbursementstatus); //just for debug, print the avenger in the console

        let row = document.createElement("tr"); //create a table row

        let cell = document.createElement("td"); //create a cell for the field
        cell.innerHTML = reimbursementstatus.reimb_status_id; //fill the cell with avenger data
        row.appendChild(cell) //this row now has the first cell (av_id)

        //the we'll do this^ for each field in the avenger model
        let cell2 = document.createElement("td");
        cell2.innerHTML =reimbursementstatus_reimb_status;
        row.appendChild(cell2);

        document.getElementById("ReimbursementstatusBody").appendChild(row);
    }
        
document.getElementById('getReimbursemenTypeButton').addEventListener('click', reimbursementtypeFunc);
async function reimbursementtypeFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our reimbursement data
    //await makes the async functions wait until the promise returns with the fetched data
    let response = await fetch(url + 'ers_reimbursement_type', {credentials: "include"});

    console.log(response);

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object


        //now, I want to put each reimburement type into my table
        for(let reimbursementtype of data) { //for every type in the data variable/object

            console.log(reimbursementtype); //just for debug, print the type in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = reimbursementtype.reimb_type__id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)

            let cell2 = document.createElement("td"); //create a cell for the field
            cell2.innerHTML = reimbursementtype.reimb_type; //fill the cell with avenger data
            row.appendChild(cell2) 

  
            document.getElementById("ReimbursementtypeBody").appendChild(row);
        }
    }
}
document.getElementById('getUsertButton').addEventListener('click', userFunc);
//this function will get all reimbursements from our Java server
async function userFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our reimbursement data
    //await makes the async functions wait until the promise returns with the fetched data
    let response = await fetch(url + 'ers_users', {credentials: "include"});

    console.log(response);

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object


        //now, I want to put each reimbinto my table
        for(let user of data) { //for every reimbursement in the data variable/object

            console.log(user); //just for debug, print the reimbursement in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = user.ers_users_id; //fill the cell with reimbursement data
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the reimbursement model
            let cell2 = document.createElement("td");
            cell2.innerHTML = user.ers_username;
            row.appendChild(cell2);

            let cell3 = document.createElement("td");
            cell3.innerHTML = user.ers_password;
            row.appendChild(cell3);

            let cell4 = document.createElement("td");
            cell4.innerHTML = user.user_first_name;
            row.appendChild(cell4);

            let cell5 = document.createElement("td");
            cell5.innerHTML = user.user_last_name;
            row.appendChild(cell5);

            let cell6 = document.createElement("td");
            cell5.innerHTML = user.user_email;
            row.appendChild(cell6);

            let cell5 = document.createElement("td");
            cell7.innerHTML = user.user_role_id;
            row.appendChild(cell7);

             //if the avenger has a home, just fill the cell with the home name
             if(user.userrole_fk != null){
                console.log("Do something")
                let cell8 = document.createElement("td");
                cell8.innerHTML = user.userole_fk.userroleId;
                row.appendChild(cell8);
            } else { //otherwise, still append the cell but leave it empty
                let cell1 = document.createElement("td");
                row.appendChild(cell8);
            }

            document.getElementById("userBody").appendChild(row);
            //so the variable "row" we created alllll the way at the top of the for loop 
            //will be appended to our empty table body in the HTML
document.getElementById('getUserRoleButton').addEventListener('click', userroleFunc);

async function userroleFunc() { //async returns a promise (which fetch returns)

    //we will send a fetch request to get our avenger data
    //await makes the async functions wait until the promise returns with the fetched data
    let response = await fetch(url + 'ers_user_roles', {credentials: "include"});

    console.log(response);

    if(response.status === 200) { //if the request is successful...
        console.log(response); //just to see what comes back for debug

        let data = await response.json(); //get the JSON data from the response, turn it into JS object


        //now, I want to put each reimbursement into my table
        for(let userrole of data) { //for every avenger in the data variable/object

            console.log(userrole); //just for debug, print the avenger in the console

            let row = document.createElement("tr"); //create a table row

            let cell = document.createElement("td"); //create a cell for the field
            cell.innerHTML = userrole.ers_user_role_id; //fill the cell with avenger data
            row.appendChild(cell) //this row now has the first cell (av_id)

            //the we'll do this^ for each field in the avenger model
            let cell2 = document.createElement("td");
            cell2.innerHTML = userrole.user_role;
            row.appendChild(cell2);


            document.getElementById("userroleBody").appendChild(row);

        }
    }
}
}
}
}
}