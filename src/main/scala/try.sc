import funsets.FunSets.Set

type Set = Int => Boolean

def union(s: Set, t: Set): Set = (x:Int) => s(x) || t(x)

val z = Set(1)
val a:Set = Set(1,2,3,4)
val b:Set = Set(2,3,5)

union(a, b)

def singletonSet(elem: Int): Set = Set(elem)

singletonSet(1)

def filter(s: Set, p: Int => Boolean): Set = (x: Int) => s(x) && p(x)
