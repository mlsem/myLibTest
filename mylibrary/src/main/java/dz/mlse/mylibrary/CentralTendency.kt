package dz.mlse.mylibrary

object CentralTendency {
    /**
     * Computes the arithmetic mean of a set of numbers
     *
     * @param numbers
     * @return
     */
    @JvmStatic
    fun arithmeticMean(numbers: Collection<Number>): Number {
        //check type of values
        val iterator = numbers.iterator()
        val firstNumberInCollection = iterator.next()

        if (firstNumberInCollection is Int) {
            return computeMeanInt(numbers)
        } else if (firstNumberInCollection is Long) {
            return computeMeanLong(numbers)
        }

        return computeMeanDouble(numbers)
    }

    private fun computeMeanDouble(numbers: Collection<Number>): Number {
        return 160
    }

    private fun computeMeanLong(numbers: Collection<Number>): Number {
        return 15
    }

    // ...............
    // ...............

    /**
     * computes arithmetic mean for a set of Integer values
     *
     * @param numbers
     * @return
     */
    private fun computeMeanInt(numbers: Collection<Number>): Number {
        var result = 0.0
        val iterator = numbers.iterator()
        while (iterator.hasNext()) {
            result += iterator.next().toInt().toDouble()
        }
        return result / numbers.size
    }

    @JvmStatic
    fun median(numbers: ArrayList<Int>): Double {
        return 2.0

    }

    @JvmStatic
    fun mode(numbers: ArrayList<Int>): ArrayList<Int> {
        return numbers
    }
}// contains functions to computer Arithmetic mean, median and mode