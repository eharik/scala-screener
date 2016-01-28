# Oseberg Scala Screener

Please complete the following and submit a PR for review.

You're welcome to use Internet resources in solving this problem, as long as they don't give you the solution. We just ask that you cite every source that you used. Also, please state with how much time you spent on this question. If you have any questions about this or would like to seek clarification, please contact us at dev.team@oseberg.io.

The development team will use this assessment to determine if you may be a suitable candidate for the position.

## Instructions

1. Complete implementation of the `io.oseberg.interview.FileStats` class.  At a minimum implement a solution to the `lineCount`, `totalWordCount`, and `wordCount` functions.  For you overachievers, take a stab at `wordFreq` as well.
2. Complete implementation of the test spec in `src/test/scala/io.oseberg/interview/ScreenerSpec.scala`.  When you run `sbt test` the first three tests should pass.
3. Complete the implementation of the `Screener` object so it prints relevant information for the file like the text below:

```
Stats for file: DoI.txt:
  Line Count: 41
  Total Word Count: 1335
  Count for 'Power': 7
```
