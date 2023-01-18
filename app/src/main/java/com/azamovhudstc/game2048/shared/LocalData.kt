package com.azamovhudstc.game2048.shared

import android.content.Context
import android.content.SharedPreferences
import com.azamovhudstc.game2048.data.Type

class LocalData {
    companion object {
        private lateinit var sharedPref: SharedPreferences
        fun getInstance(context: Context): SharedPreferences {
            if (!::sharedPref.isInitialized) sharedPref =
                context.getSharedPreferences("DATA", Context.MODE_PRIVATE)
            return sharedPref
        }


        fun setMatrix(matrix: Array<Array<Int>>) {
            for (i in matrix.indices) {
                for (j in 0 until matrix[i].size) {
                    sharedPref.edit().putInt("matrix|$i|$j", matrix[i][j]).apply()
                }
            }
        }



        fun setMatrixUndo(matrixUndo: Array<Array<Int>>) {
            for (i in matrixUndo.indices) {
                for (j in 0 until matrixUndo[i].size) {
                    sharedPref.edit().putInt("matrixUndo|$i|$j", matrixUndo[i][j]).apply()
                }
            }
        }


        fun getMatrix(): Array<Array<Int>> {
            val matrix: Array<Array<Int>> = arrayOf(
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0)
            )

            for (i in matrix.indices) {
                for (j in 0 until matrix[i].size) {
                    matrix[i][j] = sharedPref.getInt("matrix|$i|$j", 0)
                }
            }
            return matrix
        }

        fun getMatrixUndo(): Array<Array<Int>> {
            val matrixUndo: Array<Array<Int>> = arrayOf(
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0),
                arrayOf(0, 0, 0, 0)
            )
            for (i in matrixUndo.indices) {
                for (j in 0 until matrixUndo[i].size) {
                    matrixUndo[i][j] = sharedPref.getInt("matrixUndo|$i|$j", 0)
                }
            }
            return matrixUndo
        }


        fun setScore(score: Int) {
            sharedPref.edit().putInt("score", score).apply()
        }

        fun getScore(): Int {
            return sharedPref.getInt("score", 0)
        }
        fun setScoreBig(score: Int) {
            sharedPref.edit().putInt("scoreBig", score).apply()
        }

        fun getScoreBig(): Int {
            return sharedPref.getInt("scoreBig", 0)
        }

        fun setRecord(record: Int) {
            sharedPref.edit().putInt("record", record).apply()
        }

        fun getRecord(): Int {
            return sharedPref.getInt("record", 0)
        }



        fun setTarget(target: Int) {
            sharedPref.edit().putInt("target", target).apply()
        }

        fun getTarget(): Int {
            return sharedPref.getInt("target", 0)
        }

        fun setScoreUndo(scoreUndo: Int) {
            sharedPref.edit().putInt("scoreUndo", scoreUndo).apply()
        }

        fun getScoreUndo(): Int {
            return sharedPref.getInt("scoreUndo", 0)
        }

        fun setRecordUndo(recordUndo: Int) {
            sharedPref.edit().putInt("recordUndo", recordUndo).apply()
        }
        fun getRecordUndo(): Int {
            return sharedPref.getInt("recordUndo", 0)
        }



        //Big
        fun getMatrixUndoBig(): Array<Array<Int>> {
            val matrixUndo: Array<Array<Int>> = arrayOf(
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0)
            )
            for (i in matrixUndo.indices) {
                for (j in 0 until matrixUndo[i].size) {
                    matrixUndo[i][j] = sharedPref.getInt("matrixUndoBig|$i|$j", 0)
                }
            }
            return matrixUndo
        }
        fun getMatrixBig(): Array<Array<Int>> {
            val matrix: Array<Array<Int>> = arrayOf(
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0),
                arrayOf(0, 0, 0, 0,0)
            )

            for (i in matrix.indices) {
                for (j in 0 until matrix[i].size) {
                    matrix[i][j] = sharedPref.getInt("matrix_big|$i|$j", 0)
                }
            }
            return matrix
        }
        fun setMatrixUndoBig(matrixUndo: Array<Array<Int>>) {
            for (i in matrixUndo.indices) {
                for (j in 0 until matrixUndo[i].size) {
                    sharedPref.edit().putInt("matrixUndoBig|$i|$j", matrixUndo[i][j]).apply()
                }
            }
        }
        fun setMatrixBig(matrix: Array<Array<Int>>) {
            for (i in matrix.indices) {
                for (j in 0 until matrix[i].size) {
                    sharedPref.edit().putInt("matrix_big|$i|$j", matrix[i][j]).apply()
                }
            }
        }
        fun setScoreUndoBig(scoreUndo: Int) {
            sharedPref.edit().putInt("scoreUndo_big", scoreUndo).apply()
        }
        fun getScoreUndoBig(): Int {
            return sharedPref.getInt("scoreUndo_big", 0)
        }
        fun setRecordBig(record_big: Int) {
            sharedPref.edit().putInt("record_big", record_big).apply()
        }

        fun getRecordBig(): Int {
            return sharedPref.getInt("record_big", 0)
        }
        fun setRecordUndoBig(recordUndo: Int) {
            sharedPref.edit().putInt("recordUndo_undo_big", recordUndo).apply()
        }

        fun setTargetBig(target: Int) {
            sharedPref.edit().putInt("target_big", target).apply()
        }

        fun getTargetBig(): Int {
            return sharedPref.getInt("target_big", 0)
        }
        fun getRecordUndoBig(): Int {
            return sharedPref.getInt("recordUndo_undo_big", 0)
        }


        //small
        fun getMatrixUndoSmall(): Array<Array<Int>> {
            val matrixUndo: Array<Array<Int>> = arrayOf(
                arrayOf(0, 0, 0),
                arrayOf(0, 0, 0),
                arrayOf(0, 0, 0),

            )
            for (i in matrixUndo.indices) {
                for (j in 0 until matrixUndo[i].size) {
                    matrixUndo[i][j] = sharedPref.getInt("matrix_undo_small|$i|$j", 0)
                }
            }
            return matrixUndo
        }
        fun getMatrixSmall(): Array<Array<Int>> {
            val matrix: Array<Array<Int>> = arrayOf(
                arrayOf(0, 0, 0),
                arrayOf(0, 0, 0),
                arrayOf(0, 0, 0),

            )

            for (i in matrix.indices) {
                for (j in 0 until matrix[i].size) {
                    matrix[i][j] = sharedPref.getInt("matrix_small|$i|$j", 0)
                }
            }
            return matrix
        }
        fun setMatrixUndoSmall(matrixUndo: Array<Array<Int>>) {
            for (i in matrixUndo.indices) {
                for (j in 0 until matrixUndo[i].size) {
                    sharedPref.edit().putInt("matrix_undo_small|$i|$j", matrixUndo[i][j]).apply()
                }
            }
        }
        fun setMatrixSmall(matrix: Array<Array<Int>>) {
            for (i in matrix.indices) {
                for (j in 0 until matrix[i].size) {
                    sharedPref.edit().putInt("matrix_small|$i|$j", matrix[i][j]).apply()
                }
            }
        }

        fun setScoreSmall(score: Int) {
            sharedPref.edit().putInt("score_small", score).apply()
        }

        fun getScoreSmall(): Int {
            return sharedPref.getInt("score_small", 0)
        }

        fun setRecordSmall(record_small: Int) {
            sharedPref.edit().putInt("record_small", record_small).apply()
        }

        fun getRecordSmall(): Int {
            return sharedPref.getInt("record_small", 0)
        }
        fun setTargetSmall(target: Int) {
            sharedPref.edit().putInt("target_small", target).apply()
        }
        fun getTargetSmall(): Int {
            return sharedPref.getInt("target_small", 0)
        }
        fun setScoreUndoSmall(scoreUndo: Int) {
            sharedPref.edit().putInt("scoreUndo_small", scoreUndo).apply()
        }
        fun getScoreUndoSmall(): Int {
            return sharedPref.getInt("scoreUndo_small", 0)
        }
        fun setRecordUndoSmall(recordUndo: Int) {
            sharedPref.edit().putInt("recordUndo_undo_small", recordUndo).apply()
        }
        fun getRecordUndoSmall(): Int {
            return sharedPref.getInt("recordUndo_undo_small", 0)
        }


        //Home
        fun setGameTypeCount(type: String) {
            sharedPref.edit().putString("type", type).apply()
        }

        fun getGameTypeCount(): String {
            return sharedPref.getString("type", "").toString()
        }
        //Home
        fun setGameUndoType(type_undo: Boolean) {
            sharedPref.edit().putBoolean("type_undo", type_undo).apply()
        }

        fun getGameUndoType(): Boolean {
            return sharedPref.getBoolean("type_undo", true)
        }

        //Home
        fun setGameUndoTypeSmall(type_undo_small: Boolean) {
            sharedPref.edit().putBoolean("type_undo_small", type_undo_small).apply()
        }

        fun getGameUndoTypeSmall(): Boolean {
            return sharedPref.getBoolean("type_undo_small", true)
        }
        //Big
        fun setGameUndoTypeBig(type_undo_big: Boolean) {
            sharedPref.edit().putBoolean("type_undo_big", type_undo_big).apply()
        }

        fun getGameUndoTypeBig(): Boolean {
            return sharedPref.getBoolean("type_undo_big", true)
        }
    }

}