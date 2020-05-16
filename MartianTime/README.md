Link to problem [here](https://dmoj.ca/problem/ecoo14r1p1)

A day on Mars is just a little bit longer than a day on Earth. One day on Mars lasts 24 hours 37 minutes and 22.663 seconds in Earth time. To make sure they can get the most out of the daylight hours on Mars, when NASA plans a Mars Rover mission, they put all of their employees on "Martian Time".

Martian time uses a 24-hour clock divided into minutes and seconds just like Earth time. But every Martian hour, minute and second has to be just a little bit longer than its Earth counterpart.

It just so happens that at 12:00 AM on January 1st, 2015 (aka Day 1) on Earth it will also be exactly 12:00 AM of Day 1 in Martian time at the place where the next Mars rover will touch down. So NASA has issued its employees Martian digital watches, synchronized so that Day 1 at midnight matches Day 1 at midnight on Earth. These watches report the day, hour and minute of the current time (they keep track of seconds as well, but don't report that number on the face of the watch).

The input will contain 10 test cases. Each test case will consist of three integers D, H, and M representing the Day, Hour and Minute of an exact time on Earth, where Day 1 is January 1st, 2015 (1≤D≤1000, 0≤H≤23 and 0≤M≤59). Your job is to output the current time on Mars as it would be shown on the Martian digital watch described above. Each time should be on a single line and formatted exactly as shown in the sample output below.

# Sample Input
<pre>
346 12 28
393 06 40
390 19 50
984 02 25
674 21 29
435 13 07
15 04 12
539 00 50
40 01 20
69 03 11
</pre>
# Sample Output
<pre>
Day 337, 18:40
Day 383, 08:28
Day 380, 23:07
Day 959, 05:28
Day 657, 20:17
Day 424, 13:15
Day 14, 19:35
Day 525, 10:08
Day 39, 01:37
Day 67, 09:48
</pre>