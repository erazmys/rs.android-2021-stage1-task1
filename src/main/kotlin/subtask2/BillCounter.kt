package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        bill.set(k, 0)
        if (bill.sum() / 2 == b) return "Bon Appetit"
        else return "${b - bill.sum() / 2}"
    }
}
