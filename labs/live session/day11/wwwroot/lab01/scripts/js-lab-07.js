// switch (new Date().getDay()) {
//     case 0:
//         alert("Sunday");
//         break;
//     case 1:
//         alert("Monday");
//         break;
//     case 2:
//         alert("Tuesday");
//         break;
//     case 3:
//         alert("Wednesday");
//         break;
//     case 4:
//         alert("Thursday");
//         break;
//     case 5:
//         alert("Friday");
//         break;
//     case 6:
//         alert("Saturday");
//         break;
//     default:
//         alert("Did not get a day");
//         break;
// }

// var total = 0;
// let i = 1;
// while (1 == 1){
//     if (i <=100){
//         total += i;
//     }
//     else {
//         alert(`The total sum of number from 1 - 100 is == ${total}`);
//         break;
//     }
//     i++;
// }

// var result = "";
// for (let i = 1; i <= 100; i += 2){
//     result += (i + ", ");


// }
// document.write(result);

// let table = "<table>";

// for (let row = 1; row <11 ; row++){
//     table += "<tr>";

//     for (let column = 1 ; column < 11 ; column++){
//         let res = row * column;
//         table += (res <10) ?  "<td>" + "0" + res + "</td>" : "<td>" + res + "</td>" ;

//     }

//     table += "</tr>";


// }
// table += "</table>";
// document.write(table);

// const days = ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'];

// for (let i = 0; i < days.length; i++) {
//     console.log(days[i]);
// }
// console.log("-----------------------------------------");
// i = 0;
// while (i < days.length) {
//     console.log(days[i++]);
// }
// console.log("-----------------------------------------");
// days.forEach((day,i) => { console.log(i + "-"+day) });

// console.log("-------------Last One!----------------------------");

// for (let day of days)
//     console.log(day);
// console.log("-----------------------------------------");

function getMultiTable(min, max) {
    let table = "<table>"; // start of table

    for (let row = min; row <= max; row++) {
        table += "<tr>"; // start of row

        for (let column = min; column <= max; column++) {
            let res = row * column;
            // sets each cell and adds it to the table row
            table += (res < 10) ? "<td class='multiTableCell'>" + "0" + res + "</td>" : "<td class='multiTableCell'>" + res + "</td>";
        }

        table += "</tr>"; // end of row
    }
    table += "</table>"; // end of table
    return table;
}

// document.write(getMultiTable(1, 15));

// function getNames() {
//     // data
//     let names = ["Tim", "Bob", "Jack", "Helen", "Mary", "Sue"];
//     let ages = [12, 14, 13, 15, 11, 13];

//     let table = "<table>"; // start of the table
//     table += "<th>Name</th><th>Age</th>";

//     for (let i = 0; i < names.length; i++) {
//         table += "<tr>" // start of row

//         table += `<td>${names[i]}</td><td>${ages[i]}</td>`;

//         table += "</tr>";
//     }
//     table += "</table>";

//     return table;

// }

// document.write(getNames());

function getNames() {
    // data
    let names = ["Tim", "Bob", "Jack", "Helen", "Mary", "Sue"];
    let ages = [12, 14, 13, 15, 11, 13];

    let res = "";

    for (let i = 0; i < names.length; i++) {

        res += names[i];
    }

    return res;
}

let text = getNames();

let div1 = document.getElementsByTagName("div")[0];
div1.innerHTML = getNames();

div1.innerHTML = getMultiTable(1, 10);
highlightBigNumbers();

function highlightBigNumbers() {
    let tds = document.getElementsByTagName("td");

    for (let td of tds) {
        if (td.classList.contains("multiTableCell")) {
            td.style.backgroundColor = "lightgreen";
            if (parseInt(td.innerText) > 10) {
                td.classList.add("bigNumber");
            }
        }

    }
}

function changeDiv01Color() {
    let div = document.getElementById("div01");

    div.style.backgroundColor = "red";
}

// changeDiv01Color();

function showDiv() {
    let div = document.getElementById("div01");
    // div.style.display = "block";
    div.removeAttribute("hidden");
}

function hideDiv() {
    let div = document.getElementById("div01");
    // div.style.display = "none";
    div.setAttribute("hidden", "");

}