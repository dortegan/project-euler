answer = (2**1000).to_s.scan(/\d/).map(&:to_i).inject(0, &:+)
puts answer