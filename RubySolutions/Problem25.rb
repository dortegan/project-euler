def fibonacci(number)
	a = []
	a[0] = 1
	a[1] = 1
	2.upto(number-1) do |index|
		a[index] = a[index-1] + a[index-2]	
	end
	a
end

p fibonacci(100000).index { |number| number.to_s.size == 1000}