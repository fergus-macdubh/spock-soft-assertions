package org.example

import spock.lang.Specification

class SoftAssertionsTest extends Specification {
    def 'simplest test'() {
        expect:
            verifyAll {
                1 == 2
                2 == 3
            }
    }
}
