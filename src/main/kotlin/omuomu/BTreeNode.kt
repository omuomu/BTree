package omuomu

class BTreeNode(key: Int, value: String) {
    
    var key: Int
    var value: String
    init {
        this.key = key
        this.value = value
    }
    var left: BTreeNode? = null
    var right: BTreeNode? = null
}