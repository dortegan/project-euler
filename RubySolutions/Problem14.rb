def longestCollatz (number)
	terms = 1
	while number > 1
		if number % 2 == 0
			number = number / 2
		else
			number = 3*number + 1
		end
		terms += 1
	end
	terms
end

i = 999999
longest = 0
while i > 800000 do
	l = longestCollatz(i)
	if l > longest
		longest = l
		number = i
	end
	i -= 1
end

puts number