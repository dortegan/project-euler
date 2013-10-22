require 'prime'
require 'set'

def getDivisors(number)
	divisors = []
	if Prime.instance.prime?(number)
		divisors << 1
	else
		1.upto(number-1) do |divisor|
			if number % divisor == 0
				divisors << divisor
			end
		end
		divisor = 1
	end
	divisors
end

def kindOfNumber(number)
	sumDivisors = getDivisors(number).inject(&:+)
	if number == sumDivisors
		return "perfect"
	elsif number > sumDivisors
		return "deficient"
	else
		return "abundant"
	end
end

abundants = Set.new
2.upto(28123).each {|number| 
	if (kindOfNumber(number) == "abundant")
		abundants<<number
	end
}

sumaTotal = 1.upto(28123).inject(&:+)
suma = 0
1.upto(28123).each do |number|
	abundants.each do |abundant|
		resta = number - abundant
		if resta > 0 
			if abundants.include?resta
				suma += number
				break
			end
		end
	end
end

p sumaTotal - suma