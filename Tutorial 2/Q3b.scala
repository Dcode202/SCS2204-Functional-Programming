object Q3b extends App{
    def profit(ticket: Int, num: Int) : Int = ticket*num


    def count(ticket: Int) : Int = {
        if(ticket > 15)
            return ((ticket - 15) / 5) * (- 20)
        else if(15 > ticket)
            return ((15 - ticket) / 5) * 20
        else
            return 0
    }

    def totProfit(ticket: Int, num: Int) : Int = {
        return profit(ticket, num + count(ticket)) - (500 + 3*(num + count(ticket)))
    }

    print("Total Profit = " + totProfit(30, 120))

}
