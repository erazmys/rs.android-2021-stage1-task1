package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        var sadArrayFun = sadArray
        var happyArray = intArrayOf()
        var count = 2
        while (count != happyArray.size) {
            if (sadArrayFun contentEquals happyArray)
                break
            else {
                happyArray += sadArrayFun[0]
                for (it in 0 until sadArrayFun.size - 2) {
                    count++
                    if (sadArrayFun[it + 1] < sadArrayFun[it] + sadArrayFun[it + 2])
                        happyArray += sadArrayFun[it + 1]
                    else
                        continue
                }
                happyArray += sadArrayFun[sadArrayFun.lastIndex]
                if (count != happyArray.size) {
                    sadArrayFun = happyArray
                    happyArray = intArrayOf()
                    count = 2
                }
            }
        }
        return happyArray
    }
}
