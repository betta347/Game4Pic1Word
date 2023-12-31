package uz.gita.game4pic1word.repository

import uz.gita.game4pic1word.R
import uz.gita.game4pic1word.data.Question

class Repository {
    companion object {
        private lateinit var instance: Repository

        fun getInstance(): Repository {
            if (!(::instance.isInitialized))
                instance = Repository()
            return instance
        }
    }

    val list = ArrayList<Question>()

    init {
        loadData()
    }

    private fun loadData() {
        list.add(
            Question(
                R.drawable.ananas,
                R.drawable.apple,
                R.drawable.banana,
                R.drawable.pomegranate,
                "AFKMDPRUOYGHIPIT",
                "FRUIT"
            )
        )
        list.add(
            Question(
                R.drawable.ferrari_1,
                R.drawable.ferrari_2,
                R.drawable.ferrari_3,
                R.drawable.ferrari_4,
                "WQFLLEROFRYJMRAI",
                "FERRARI"
            )
        )
        list.add(
            Question(
                R.drawable.farosat1,
                R.drawable.farosat3,
                R.drawable.farosat2,
                R.drawable.farosat4,
                "BSJAPXTQFEAYLURO",
                "FAROSAT"
            )
        )
        list.add(
            Question(
                R.drawable.animal_1_1_panda,
                R.drawable.animal_1_2_panda,
                R.drawable.animal_1_3_panda,
                R.drawable.animal_1_4_panda,
                "KLPAERVBNMNDUYAT",
                "PANDA"
            )
        )
        list.add(
            Question(
                R.drawable.animal_2_1_zebra,
                R.drawable.animal_2_2_zebra,
                R.drawable.animal_2_3_zebra,
                R.drawable.animal_2_4_zebra,
                "GHZYUEIOBWERSDCA",
                "ZEBRA"
            )
        )
        list.add(
            Question(
                R.drawable.animal_3_1_giraffe,
                R.drawable.animal_3_2_giraffe,
                R.drawable.animal_3_3_giraffe,
                R.drawable.animal_3_4_giraffe,
                "QGDIVRNAMFZFQEYP",
                "GIRAFFE"
            )
        )
        list.add(
            Question(
                R.drawable.animal_4_1_monkey,
                R.drawable.animal_4_2_monkey,
                R.drawable.animal_4_3_monkey,
                R.drawable.animal_4_4_monkey,
                "MONKEYQWERTYUIOP",
                "MONKEY"
            )
        )
        list.add(
            Question(
                R.drawable.animal_5_1_lion,
                R.drawable.animal_5_2_lion,
                R.drawable.animal_5_3_lion,
                R.drawable.animal_5_4_lion,
                "LIONZXCVASDFQWER",
                "LION"
            )
        )

        list.add(
            Question(
                R.drawable.animal_6_1_tiger,
                R.drawable.animal_6_2_tiger,
                R.drawable.animal_6_3_tiger,
                R.drawable.animal_6_4_tiger,
                "TIGERMNBVFGHJKUY",
                "TIGER"
            )
        )
        list.add(
            Question(
                R.drawable.animal_7_1_camel,
                R.drawable.animal_7_2_camel,
                R.drawable.animal_7_3_camel,
                R.drawable.animal_7_4_camel,
                "CAMELSDFGHJKLOPI",
                "CAMEL"
            )
        )

        list.add(
            Question(
                R.drawable.animal_8_1_shark,
                R.drawable.animal_8_2_shark,
                R.drawable.animal_8_3_shark,
                R.drawable.animal_8_4_shark,
                "SHARKQWERTYUIOPK",
                "SHARK"
            )
        )
        list.add(
            Question(
                R.drawable.animal_9_1_duck,
                R.drawable.animal_9_2_duck,
                R.drawable.animal_9_3_duck,
                R.drawable.animal_9_4_duck,
                "DUCKADSFGHJLMCVX",
                "DUCK"
            )
        )
        list.add(
            Question(
                R.drawable.animal_10_1_owl,
                R.drawable.animal_10_2_owl,
                R.drawable.animal_10_3_owl,
                R.drawable.animal_10_4_owl,
                "OWLMNBGHJKLFDSAT",
                "OWL"
            )
        )
        list.add(
            Question(
                R.drawable.color_1_1_black,
                R.drawable.color_1_2_black,
                R.drawable.color_1_3_black,
                R.drawable.color_1_4_black,
                "KLPAERVBNCNDUYAT",
                "BLACK"
            )
        )
        list.add(
            Question(
                R.drawable.color_2_1_white,
                R.drawable.color_2_2_white,
                R.drawable.color_2_3_white,
                R.drawable.color_2_4_white,
                "GHZYUEIOBWERSDTA",
                "WHITE"
            )
        )
        list.add(
            Question(
                R.drawable.color_3_1_green,
                R.drawable.color_3_2_green,
                R.drawable.color_3_3_green,
                R.drawable.color_3_4_green,
                "GREENRNAMFZFQUYP",
                "GREEN"
            )
        )

        list.add(
            Question(
                R.drawable.color_4_1_blue,
                R.drawable.color_4_2_blue,
                R.drawable.color_4_3_blue,
                R.drawable.color_4_4_blue,
                "BLUEASDFGHJKQWRT",
                "BLUE"
            )
        )
        list.add(
            Question(
                R.drawable.color_5_1_yellow,
                R.drawable.color_5_2_yellow,
                R.drawable.color_5_3_yellow,
                R.drawable.color_5_4_yellow,
                "YELLOWQAZXSCDFVG",
                "YELLOW"
            )
        )
        list.add(
            Question(
                R.drawable.color_6_1_pink,
                R.drawable.color_6_2_pink,
                R.drawable.color_6_3_pink,
                R.drawable.color_6_4_pink,
                "PINKQWERTASDFGZX",
                "PINK"
            )
        )
        list.add(
            Question(
                R.drawable.color_7_1_purple,
                R.drawable.color_7_2_purple,
                R.drawable.color_7_3_purple,
                R.drawable.color_7_4_purple,
                "PURPLEQWRTYASCVB",
                "PURPLE"
            )
        )
        list.add(
            Question(
                R.drawable.color_8_1_orange,
                R.drawable.color_8_2_orange,
                R.drawable.color_8_3_orange,
                R.drawable.color_8_4_orange,
                "ORANGEQWTYUIPMBC",
                "ORANGE"
            )
        )
        list.add(
            Question(
                R.drawable.color_9_1_grey,
                R.drawable.color_9_2_grey,
                R.drawable.color_9_3_grey,
                R.drawable.color_9_4_grey,
                "GREYAQWERTYUIMNB",
                "GREY"
            )
        )
        list.add(
            Question(
                R.drawable.color_10_1_brown,
                R.drawable.color_10_2_brown,
                R.drawable.color_10_3_brown,
                R.drawable.color_10_4_brown,
                "BROWNQERTYUIOPKJ",
                "BROWN"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_1_1_pencil,
                R.drawable.classroom_1_2_pencil,
                R.drawable.classroom_1_3_pencil,
                R.drawable.classroom_1_4_pencil,
                "PENCILQWASZXDFCV",
                "PENCIL"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_2_1_bag,
                R.drawable.classroom_2_2_bag,
                R.drawable.classroom_2_3_bag,
                R.drawable.classroom_2_4_bag,
                "GHZYUEIOBWERSDCA",
                "BAG"
            )
        )

        list.add(
            Question(
                R.drawable.classroom_4_1_board,
                R.drawable.classroom_4_2_board,
                R.drawable.classroom_4_3_board,
                R.drawable.classroom_4_4_board,
                "BOARDQWERTYUIPLK",
                "BOARD"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_5_1_desk,
                R.drawable.classroom_5_2_desk,
                R.drawable.classroom_5_3_desk,
                R.drawable.classroom_5_4_desk,
                "KIONZXCVASDFQWER",
                "DESK"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_6_1_book,
                R.drawable.classroom_6_2_book,
                R.drawable.classroom_6_3_book,
                R.drawable.classroom_6_4_book,
                "TIGEOONBVFGHJKUY",
                "BOOK"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_7_1_eraser,
                R.drawable.classroom_7_2_eraser,
                R.drawable.classroom_7_3_eraser,
                R.drawable.classroom_7_4_eraser,
                "CAMELSRFGHJELORI",
                "ERASER"
            )
        )

        list.add(
            Question(
                R.drawable.classroom_8_1_glue,
                R.drawable.classroom_8_2_glue,
                R.drawable.classroom_8_3_glue,
                R.drawable.classroom_8_4_glue,
                "GLUEQWERTYIOZXCV",
                "GLUE"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_9_1_scissor,
                R.drawable.classroom_9_2_scissor,
                R.drawable.classroom_9_3_scissor,
                R.drawable.classroom_9_4_scissor,
                "SCISSORQWETYUMNB",
                "SCISSOR"
            )
        )
        list.add(
            Question(
                R.drawable.classroom_10_1_notebook,
                R.drawable.classroom_10_2_notebook,
                R.drawable.classroom_10_3_notebook,
                R.drawable.classroom_10_4_notebook,
                "NOTEBOOKBIYRWVCX",
                "NOTEBOOK"
            )
        )
      list.shuffle()
    }

    fun getListOfData(): List<Question> {
        return list
    }
}