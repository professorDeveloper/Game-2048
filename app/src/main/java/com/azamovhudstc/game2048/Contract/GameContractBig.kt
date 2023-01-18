package com.azamovhudstc.game2048.Contract

interface GameContractBig {
    interface Repository{
        fun getMatrix(): Array<Array<Int>>
        fun moveLeft()
        fun moveRight()
        fun moveUp()
        fun moveDown()
        fun getRecord(): Int
        fun getTarget(): Int
        fun getScore(): Int
        fun saveData()
        fun undo()

        fun restart()
    }

    interface View{
        fun changeState(matrix: Array<Array<Int>>)
        fun showFinishDialog()
    }

    interface Presenter{
        fun getScore() : Int
        fun startGame()
        fun getRecord(): Int
        fun moveLeft()
        fun moveRight()
        fun moveUp()
        fun moveDown()
        fun getTarget(): Int
        fun undo()
        fun restart()
        fun saveData()


        fun checkFinish()
    }
}