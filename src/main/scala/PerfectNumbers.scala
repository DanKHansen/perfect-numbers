enum NumberType:
   case Perfect, Abundant, Deficient
object PerfectNumbers:
   def classify(i: Int): Either["String", NumberType] = ???
