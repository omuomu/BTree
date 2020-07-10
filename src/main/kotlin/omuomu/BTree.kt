package omuomu

const val MAX_DEPTH = 5
class BTree {
    
    fun start() {
        while(true) {

            println("> Please input key: ")
            var inputKey = readLine()
            if(inputKey == "exit"|| inputKey == null) {
                break
            }
            inputKey.toInt()
            println("> Please input value: ")
            var inputValue = readLine()
            if(inputValue == null) {
                break
            }
            
            itemFind(inputKey.toInt(), inputValue)
        }
        println("Bye")
    }

    // Treeの初期化
    // root

    fun initTree() {
    }
    // 
    fun itemFind(key: Int, value: String) {
        var depthCount: Int = 0
        while() {
            compare(key: Int, value: String)
            if(depthCount == MAX_DEPTH) {
                break
            }
            depthCount++
        }
        if()
    }
    // left rightを判別
    fun compare(key: Int, value: String) {
        // if(key == __) {
        //     (key)
        // }
        // // left
        // if(key < __ ) {

        // }
        // // right
        // if(key > __) {

        // }
    }

}