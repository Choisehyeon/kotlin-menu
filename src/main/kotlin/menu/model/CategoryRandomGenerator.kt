package menu.model

import camp.nextstep.edu.missionutils.Randoms

class CategoryRandomGenerator {

    fun generate() : Category {
        return Category.getCategories().get(Randoms.pickNumberInRange(RANDOM_LOWER_INCLUSIVE-1, RANDOM_UPPER_INCLUSIVE-1))
    }

    companion object {
        const val RANDOM_LOWER_INCLUSIVE = 1
        const val RANDOM_UPPER_INCLUSIVE = 5
    }
}