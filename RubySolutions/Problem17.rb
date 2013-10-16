numbers = {0=>"",1=>"one", 2=>"two", 3=>"three", 4=>"four", 5=>"five", 6=>"six", 7=>"seven",
8=>"eight", 9=>"nine", 10=>"ten", 11=>"eleven", 12=>"twelve", 13=>"thirteen", 14=>"fourteen",
15=>"fifteen", 16=>"sixteen", 17=>"seventeen", 18=>"eighteen", 19=>"nineteen", 20=>"twenty",
30=>"thirty", 40=>"forty", 50=>"fifty", 60=>"sixty", 70=>"seventy", 80=>"eighty", 90=>"ninety",
100=>"hundred", 1000=>"thousand"}

def writeNumber(wordNumbers, index, k, numbers)
	case index[k]
		when "2"
			wordNumbers << numbers[20]
		when "3"
			wordNumbers << numbers[30]
		when "4"
			wordNumbers << numbers[40]
		when "5"
			wordNumbers << numbers[50]
		when "6"
			wordNumbers << numbers[60]
		when "7"
			wordNumbers << numbers[70]
		when "8"
			wordNumbers << numbers[80]
		when "9"
			wordNumbers << numbers[90]			
		end
end

wordNumbers = ""
1.upto(1000) do |i|
	if i < 20
		wordNumbers << numbers[i]
	elsif i >= 20 && i < 100 &&
		index = i.to_s
		writeNumber(wordNumbers, index, 0, numbers)
		wordNumbers << numbers[index[1].to_i]
	elsif i >= 100 && i < 1000
		index = i.to_s
		case index[0]
		when "1"
			wordNumbers << numbers[1]
			wordNumbers << numbers[100]
		when "2"
			wordNumbers << numbers[2]
			wordNumbers << numbers[100]
		when "3"
			wordNumbers << numbers[3]
			wordNumbers << numbers[100]
		when "4"
			wordNumbers << numbers[4]
			wordNumbers << numbers[100]
		when "5"
			wordNumbers << numbers[5]
			wordNumbers << numbers[100]
		when "6"
			wordNumbers << numbers[6]
			wordNumbers << numbers[100]
		when "7"
			wordNumbers << numbers[7]
			wordNumbers << numbers[100]
		when "8"
			wordNumbers << numbers[8]
			wordNumbers << numbers[100]
		when "9"
			wordNumbers << numbers[9]
			wordNumbers << numbers[100]			
		end
		if !(index[1] == "0" && index[2] == "0")
			wordNumbers << "and"
			if index[1] == "1"
				wordNumbers << numbers[index[1,2].to_i]
			else
				writeNumber(wordNumbers, index, 1, numbers)
				wordNumbers << numbers[index[2].to_i]
			end
		end
	else
		wordNumbers << numbers[1]
		wordNumbers << numbers[i]
	end
end

#puts wordNumbers
puts wordNumbers.size