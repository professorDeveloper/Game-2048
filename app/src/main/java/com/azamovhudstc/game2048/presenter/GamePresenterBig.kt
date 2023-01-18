package com.azamovhudstc.game2048.presenter

import com.azamovhudstc.game2048.Contract.GameContract
import com.azamovhudstc.game2048.Contract.GameContractBig

class GamePresenterBig(
    private val view: GameContractBig.View,
    private val repository: GameContractBig.Repository
) : GameContractBig.Presenter {
    override fun getScore(): Int {
        return repository.getScore()

    }

    override fun startGame() {
        view.changeState(repository.getMatrix())
    }

    fun gameOver() {

    }

    override fun moveLeft() {
        repository.moveLeft()
        view.changeState(repository.getMatrix())
        checkFinish()
    }

    override fun moveRight() {
        repository.moveRight()
        view.changeState(repository.getMatrix())
        checkFinish()
    }

    override fun moveUp() {
        repository.moveUp()
        view.changeState(repository.getMatrix())
        checkFinish()
    }

    override fun moveDown() {
        repository.moveDown()
        view.changeState(repository.getMatrix())
        checkFinish()
    }

    override fun getTarget(): Int {
        return repository.getTarget()
    }

    override fun undo() {
        repository.undo()
        view.changeState(repository.getMatrix())
    }


    override fun restart() {
        repository.restart()
        view.changeState(repository.getMatrix())
    }

    override fun saveData() {
        repository.saveData()
    }

    override fun getRecord(): Int {
        return repository.getRecord()
    }

    override fun checkFinish(){
        val matrix = repository.getMatrix()
        for(i in 0..4) {
            var temp = ""
            for(j in 0..4) {
                temp += matrix[i][j].toString() + " "
            }

        }

        for(i in matrix) {
            for(j in i) {
                if(j == 0)
                    return
            }
        }
        for(i in 0..4){
            for (j in 1..4){
                if (matrix[i][j] == matrix[i][j-1]){
                    return
                }
            }
        }
        for(j in 0..4) {
            for(i in 1..4) {
                if(matrix[i][j] == matrix[i - 1][j])
                    return
            }
        }
        view.showFinishDialog()
    }
}