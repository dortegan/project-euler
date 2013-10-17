require 'prime'
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

def amicableNumbers(maxIterate)
	sum = 0
	2.upto(maxIterate-1) do |number|
		sumOfDivisors = getDivisors(number).inject(&:+)
		if sumOfDivisors != 1
			amicable = getDivisors(sumOfDivisors).inject(&:+)
			if number == amicable && amicable != sumOfDivisors
				sum += amicable + sumOfDivisors
			end
		end
	end
	# Se divide en 2 porque en la suma se repiten los amicable numbers 
	sum/2
end

puts amicableNumbers(10000)