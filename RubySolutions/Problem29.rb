require 'set'
numbers = Set.new
2.upto(100) do |a|
	2.upto(100) do |b|
		numbers.add(a**b)
	end
end

puts numbers.size