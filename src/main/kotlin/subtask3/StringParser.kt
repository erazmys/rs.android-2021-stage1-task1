package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        var getResult = emptyArray<String>()
        var counter = 0
        for (it in inputString) {
            counter += 1
            if (it == '<') {
                var item = ""
                loop@ for (it in inputString.subSequence(counter, inputString.lastIndex + 1)) {
                    when {
                        it != '>' -> item += it
                        it == '>' -> {
                            getResult += item
                            break@loop
                        }
                    }
                }
            }
            if (it == '(') {
                var item = ""
                loop@ for (it in inputString.subSequence(counter, inputString.lastIndex + 1)) {
                    when {
                        it != ')' -> item += it
                        it == ')' -> {
                            getResult += item
                            break@loop
                        }
                    }
                }
            }
            if (it == '[') {
                var item: String = ""
                loop@ for (it in inputString.subSequence(counter, inputString.lastIndex + 1)) {
                    when {
                        it != ']' -> item += it
                        it == ']' -> {
                            getResult += item
                            break@loop
                        }
                    }
                }
            }
        }
        return getResult
    }
}
