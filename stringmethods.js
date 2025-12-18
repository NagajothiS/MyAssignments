let language = "Playwright@2025"
//count the number of characters -> length
//index starts from 0
console.log("Length:", language.length)

//CharAt -> print any character based on index value
console.log("Print the second character:",language.charAt(1))

//convert the string to uppercase and lowercase
console.log(language.toUpperCase())
console.log(language.toLowerCase())
//Concatination
let version = "24.10.0"
console.log(language.concat(version)) 
//splitting the words in a sentence
let lang = "Playwright 24.10.0"
let splitlang = lang.split(" ")
console.log(splitlang)

for (i=0;i<=splitlang.length;i++)
{
console.log(splitlang.charAt(i))
}




