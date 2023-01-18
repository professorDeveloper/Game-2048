package com.azamovhudstc.game2048.utils

fun ArrayList<ArrayList<Int>>.deepCopy(): ArrayList<ArrayList<Int>> {
    var matrix = ArrayList<ArrayList<Int>>()
    for (i in 0 until this.size) {
        for (j in 0 until this[i].size) {
            matrix[i][j] = this[i][j]
        }
    }
    return matrix
}
fun ArrayList<ArrayList<Int>>.deepEquals(other:ArrayList<ArrayList<Int>>):Boolean{
    for (i in 0 until  this.size){
        for (j in 0 until  this[i].size){
            if (other[i][j]!=this[i][j]) return false
        }
    }
    return true
}