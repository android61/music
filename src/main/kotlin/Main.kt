fun main() {
    val amount = 25000 // сумма
    val discountStandart = 100 //обычная скидка
    val discountBestBayer = 0.05 //скидка, если выше 10000рублей
    val discountRegularBayer = 0.01 // скидка постоянному покупателю
    val regularBayer = true

    var priceWithDiscount: Int = 0 // расчет полной скидки покупки

    if (amount <= 1000) {
        println("Сумма Ваших покупок $amount Вы купили менее 1000 руб., спасибо, но скидка Вам не полагается.")
    } else if (amount > 1_000 && amount<10_000) {
        priceWithDiscount = amount - discountStandart
        println("Сумма Ваших покупок $amount руб., Ваша скидка $discountStandart руб. " +
                "ИТОГО: $priceWithDiscount руб.")
    } else if (amount > 10000)  {
        priceWithDiscount = amount -  (amount * discountBestBayer).toInt()
        println("Сумма Ваших покупок $amount руб., Ваша скидка 5% " +
                "ИТОГО: $priceWithDiscount руб.")
    }

    // Дополнительный расчет скидки для постоянных клиентов
    var totalPriceWithDiscount: Int = 0
    if (regularBayer == true) {
        totalPriceWithDiscount = priceWithDiscount - (priceWithDiscount * discountRegularBayer).toInt()
        println("Так как Вы наш постоянный клиент, поэтому для Вас дополнительная скидка 1% " +
                "ИТОГО: $totalPriceWithDiscount руб.")
    }
}








