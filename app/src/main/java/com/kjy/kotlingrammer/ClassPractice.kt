package com.kjy.kotlingrammer

import java.lang.IllegalArgumentException

/**
 * Sealed class
 */


sealed class Outer {
    class One: Outer()
    class Two: Outer()
    class Three: Outer()
}



