require 'prime'

def getDivisors(number)
	number.prime_division.map(&:last).map{|n| n+1}.inject(1, &:*)
end

def highlyDivisibleTriangularNumber(numberOfDivisors, numberOfSequence)
	getSequenceOfTriangleNumbers(numberOfSequence).each do |number|
		if getDivisors(number) > numberOfDivisors
			puts number
			break
		end
	end
end

def getSequenceOfTriangleNumbers(number)
	sequence = [1]
	i = 1
	while i < number do
		sequence[i] = i + 1 + sequence[i-1]
		i += 1
	end
	sequence
end

highlyDivisibleTriangularNumber(500, 1000000)
puts getDivisors(76576500)