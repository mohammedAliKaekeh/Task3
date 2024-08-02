fun main()
{
    //1-Right-Angle Triangle
    for (i in 1..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    //2-Drawing an Isosceles Triangle
    for (i in 1..5) {
        for (j in 1..(5 - i)) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }

    //3-Drawing a Pyramid
    for (i in 1..5) {
        for (j in 1..(5 - i)) {
            print(" ")
        }
        for (k in 1..(2 * i - 1)) {
            print("*")
        }
        println()
    }
    println("==================================================")

    //4-Counting Vowels in a String
    println("Enter a String: ")
    val str: String = readln()
    var count = 0

    for(char in str) {
        if(char == 'a' || char == 'A')
        {
            count++
        }
        else if(char == 'e' || char == 'E')
        {
            count++
        }
        else if(char == 'o' || char == 'O')
        {
            count++
        }
        else if(char == 'i' || char == 'I')
        {
            count++
        }
        else if(char == 'u' || char == 'U')
        {
            count++
        }
    }
    println("This String $str contain $count vowels")
    println("==================================================")

    //5: Reversing a String
    val strReverse = "Kotlin"
    val reversed = strReverse.reversed()
    println("Original String: $strReverse")
    println("Reversed String: $reversed")
    println("==================================================")

    //6: Filtering Digits from a String
    val input = "K0t1l1n 2s 4w3s0m3"
    val digits = input.filter { it.isDigit() }
    println("Digits in the string: $digits")
    println("==================================================")

    //7: Splitting a String into Words
    val strSplit = "Kotlin is great language"
    val splitt = strSplit.split(" ")
    println("$strSplit After split $splitt")
    println("==================================================")

    //8: Counting Words in a String
    val countingWordsInStr = "Kotlin is great language"
    val words = input.split(" ")
    val wordCount = words.size
    println("Number of words in the $countingWordsInStr: $wordCount")
    println("==================================================")

    //9: Removing Spaces from a String
    val strWithSpace = "Kotlin is fun"
    val result = strWithSpace.replace(" ", "")
    println("String after removing spaces: $result")

}