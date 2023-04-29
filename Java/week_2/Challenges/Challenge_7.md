# Challenge 7: Check the difference of trade in 2019 and 2020 using maps and a month. (hard challenge)

- Repository: `java_week_2`

- Type of Challenge: `Learning`

- Team challenge : `solo`

  

## The Mission

This is a hard challenge. Using the same csv file, write a program that will make a comparison of the export values of the months 
of the year 2019 with the year of 2020. The country is the 'European Union'. Make use of HashMaps and the 
`Collectors.groupingBy`function in the `Collectors` api of the streams api. They 'key' function needs to be the month, 
and the 'value' function needs to be the sum of the export values for that month. 

**Hint:** you cannot do this with only 1 stream. You will need to create 2 streams, one for the year 2019 and
one for the year 2020. The result of those stream operations will be 2 HashMaps: one for the year 2019 and
one for the year 2020. 

The map for the year 2019 could look like this: 

| key     | value       |
| ------- | ----------- |
| 01/2010 | 190 000 000 |
| 02/2010 | 345 000 000 |
| 03/2010 | 210 000 000 |

**Hint:** Filter before you use the `Collectors.groupingBy` function. 

**Expected result is a print out of each month of both years, comparing the values. **

### 