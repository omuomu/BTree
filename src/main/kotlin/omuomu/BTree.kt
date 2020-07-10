package omuomu

import omuomu.BTreeNode

const val MAX_DEPTH = 5

class BTree {
    var root: BTreeNode? = null
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
                println("${find(inputKey.toInt())}")
            } else {

            }
        }
        println("Bye")
    }

    // fun insert(key: Int, value: String) {
    //     val node = BTreeNode(key: Int, value: String)

    //     root { 
    //         insertNode(current: root, insert: node) 
    //     }else {
    //         root = node
    //     }

    // }

    // Treeの初期化
    // root

    private fun find(key: Int): String{
        if(root == null){
            return ""
        } else {
            return findNode(root!!, key)
        }
    }
    // left rightを判別
    private fun findNode(current: BTreeNode, key: Int): String {
        
        if(current.key == key) {
            return current.value
        } else if(key < current.key) {
            return findNode(current.left!!, key)
        } else if(key > current.key) {
            return findNode(current.right!!, key)
        } else {
            return "Error"
        }
    }
}
