perm = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]

i = 1
perm.permutation(10). each do |permut| 
	if i == 1000000
		p permut
		break
	else
		i += 1
	end
end