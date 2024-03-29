package com.example.kana.logic

object SyllableMatrix {

    val matrix = arrayOf(
        arrayOf(
            Syllable("a", "あ", "ア"),
            Syllable("i", "い", "イ"),
            Syllable("u", "う", "ウ"),
            Syllable("e", "え", "エ"),
            Syllable("o", "お", "オ")
        ),

        arrayOf(
            Syllable("ka", "か", "カ"),
            Syllable("ki", "き", "キ"),
            Syllable("ku", "く", "ク"),
            Syllable("ke", "け", "ケ"),
            Syllable("ko", "こ", "コ")
        ),

        arrayOf(
            Syllable("sa", "さ", "サ"),
            Syllable("shi", "し", "シ"),
            Syllable("su", "す", "ス"),
            Syllable("se", "せ", "セ"),
            Syllable("so", "そ", "ソ")
        ),

        arrayOf(
            Syllable("ta", "た", "タ"),
            Syllable("chi", "ち", "チ"),
            Syllable("tsu", "つ", "ツ"),
            Syllable("te", "て", "テ"),
            Syllable("to", "と", "ト")
        ),

        arrayOf(
            Syllable("na", "な", "ナ"),
            Syllable("ni", "に", "ニ"),
            Syllable("nu", "ぬ", "ヌ"),
            Syllable("ne", "ね", "ネ"),
            Syllable("no", "の", "ノ")
        ),

        arrayOf(
            Syllable("ha", "は", "ハ"),
            Syllable("hi", "ひ", "ヒ"),
            Syllable("fu", "ふ", "フ"),
            Syllable("he", "へ", "ヘ"),
            Syllable("ho", "ほ", "ホ")
        ),

        arrayOf(
            Syllable("ma", "ま", "マ"),
            Syllable("mi", "み", "ミ"),
            Syllable("mu", "む", "ム"),
            Syllable("me", "め", "メ"),
            Syllable("mo", "も", "モ")
        ),

        arrayOf(
            Syllable("ya", "や", "ヤ"),
            null,
            Syllable("yu", "ゆ", "ユ"),
            null,
            Syllable("yo", "よ", "ヨ")
        ),

        arrayOf(
            Syllable("ra", "ら", "ラ"),
            Syllable("ri", "り", "リ"),
            Syllable("ru", "る", "ル"),
            Syllable("re", "れ", "レ"),
            Syllable("ro", "ろ", "ロ")
        ),

        arrayOf(
            Syllable("wa", "わ", "ワ"),
            null,
            null,
            null,
            Syllable("wo", "を", "ヲ")),

        arrayOf(
            Syllable("n", "ん", "ン"),
            null,
            null,
            null,
            null),

        arrayOf(
            Syllable("ga", "が", "ガ"),
            Syllable("gi", "ぎ", "ギ"),
            Syllable("gu", "ぐ", "グ"),
            Syllable("ge", "げ", "ゲ"),
            Syllable("go", "ご", "ゴ")
        ),

        arrayOf(
            Syllable("za", "ざ", "ザ"),
            Syllable("ji", "じ", "ジ"),
            Syllable("zu", "ず", "ズ"),
            Syllable("ze", "ぜ", "ゼ"),
            Syllable("zo", "ぞ", "ゾ")
        ),

        arrayOf(
            Syllable("da", "だ", "ダ"),
            Syllable("ji", "ぢ", "ヂ"),
            Syllable("zu", "づ", "ヅ"),
            Syllable("de", "で", "デ"),
            Syllable("do", "ど", "ド")
        ),

        arrayOf(
            Syllable("ba", "ば", "バ"),
            Syllable("bi", "び", "ビ"),
            Syllable("bu", "ぶ", "ブ"),
            Syllable("be", "べ", "ベ"),
            Syllable("bo", "ぼ", "ボ")
        ),

        arrayOf(
            Syllable("pa", "ぱ", "パ"),
            Syllable("pi", "ぴ", "ピ"),
            Syllable("pu", "ぷ", "プ"),
            Syllable("pe", "ぺ", "ペ"),
            Syllable("po", "ぽ", "ポ")
        ),

        arrayOf(
            Syllable("kya", "きゃ", "キャ"),
            null,
            Syllable("kyu", "きゅ", "キュ"),
            null,
            Syllable("kyo", "きょ", "キョ")
        ),

        arrayOf(
            Syllable("sha", "しゃ", "シャ"),
            null,
            Syllable("shu", "しゅ", "シュ"),
            null,
            Syllable("sho", "しょ", "ショ")
        ),

        arrayOf(
            Syllable("cha", "ちゃ", "チャ"),
            null,
            Syllable("chu", "ちゅ", "チュ"),
            null,
            Syllable("cho", "ちょ", "チョ")
        ),

        arrayOf(
            Syllable("nya", "にゃ", "ニャ"),
            null,
            Syllable("nyu", "にゅ", "ニュ"),
            null,
            Syllable("nyo", "にょ", "ニョ")
        ),

        arrayOf(
            Syllable("hya", "ひゃ", "ヒャ"),
            null,
            Syllable("hyu", "ひゅ", "ヒュ"),
            null,
            Syllable("hyo", "ひょ", "ヒョ")
        ),

        arrayOf(
            Syllable("mya", "みゃ", "ミャ"),
            null,
            Syllable("myu", "みゅ", "ミュ"),
            null,
            Syllable("myo", "みょ", "ミョ")
        ),

        arrayOf(
            Syllable("rya", "りゃ", "リャ"),
            null,
            Syllable("ryu", "りゅ", "リュ"),
            null,
            Syllable("ryo", "りょ", "リョ")
        ),

        arrayOf(
            Syllable("gya", "ぎゃ", "ギャ"),
            null,
            Syllable("gyu", "ぎゅ", "ギュ"),
            null,
            Syllable("gyo", "ぎょ", "ギョ")
        ),

        arrayOf(
            Syllable("ja", "じゃ", "ジャ"),
            null,
            Syllable("ju", "じゅ", "ジュ"),
            null,
            Syllable("jo", "じょ", "ジョ")
        ),

        arrayOf(
            Syllable("bya", "びゃ", "ビャ"),
            null,
            Syllable("byu", "びゅ", "ビュ"),
            null,
            Syllable("byo", "びょ", "ビョ")
        ),

        arrayOf(
            Syllable("pya", "ぴゃ", "ピャ"),
            null,
            Syllable("pyu", "ぴゅ", "ピュ"),
            null,
            Syllable("pyo", "ぴょ", "ピョ")
        )
    )


    /**
     * Returns the specified romanji syllable as a String. Note: Every syllable consists
     * of one vowel and one consonant.
     * @param vowel the vowel of the syllable
     * @param consonant the consonant of the syllable
     * @return the specified syllable as a String.
     */
    fun getSyllable(vowel: String, consonant: Char): Syllable? {
        val rowPosition: Int
        val isYVariant = vowel[0] == 'y'
        when (if (isYVariant) vowel[1] else vowel[0]) {
            'a' -> rowPosition = 0
            'i' -> rowPosition = 1
            'u' -> rowPosition = 2
            'e' -> rowPosition = 3
            'o' -> rowPosition = 4
            else -> rowPosition = -1
        }
        val columnPosition: Int
        if (!isYVariant) {
            when (consonant) {
                'a' -> columnPosition = 0
                'k' -> columnPosition = 1
                's' -> columnPosition = 2
                't' -> columnPosition = 3
                'n' -> columnPosition = 4
                'h' -> columnPosition = 5
                'm' -> columnPosition = 6
                'y' -> columnPosition = 7
                'r' -> columnPosition = 8
                'w' -> columnPosition = 9
                'g' -> columnPosition = 11
                'z' -> columnPosition = 12
                'd' -> columnPosition = 13
                'b' -> columnPosition = 14
                'p' -> columnPosition = 15
                else -> columnPosition = -1
            }
        } else {
            when (consonant) {
                'k' -> columnPosition = 16
                's' -> columnPosition = 17
                't' -> columnPosition = 18
                'c' -> columnPosition = 18
                'n' -> columnPosition = 19
                'h' -> columnPosition = 20
                'm' -> columnPosition = 21
                'r' -> columnPosition = 22
                'g' -> columnPosition = 23
                'z' -> columnPosition = 24
                'j' -> columnPosition = 24
                'b' -> columnPosition = 25
                'p' -> columnPosition = 26
                else -> columnPosition = -1
            }
        }

        return if (rowPosition == -1 || columnPosition == -1) {
            null
        } else matrix[columnPosition][rowPosition]

    }


    /**
     * Returns the specified special romanji syllable as a String.
     * @param consonant the special syllable identifier
     * @return the specified syllable as a String.
     */
    fun getSyllable(consonant: Char): Syllable? {
        return if (consonant == 'n') {
            matrix[10][0]
        } else null
    }
}