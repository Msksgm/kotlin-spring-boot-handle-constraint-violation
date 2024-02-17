package com.example.kotlinspringboothandleconstraintviolation

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * アプリケーションのエントリーポイント
 *
 */
@SpringBootApplication
class KotlinSpringBootHandleConstraintViolationApplication

/**
 * アプリケーションを起動する際の main 関数
 *
 * @param args
 */
fun main(args: Array<String>) {
    @Suppress("SpreadOperator")
    runApplication<KotlinSpringBootHandleConstraintViolationApplication>(*args)
}
