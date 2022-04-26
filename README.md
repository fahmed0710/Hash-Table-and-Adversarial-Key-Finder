# Hash-Table-and-Adversarial-Key-Finder
Let H be a (finite) collection of hash functions that map a given universe U of keys… into the range {0, 1, …, m - 1}.
H is said to be universal if for a random hash function from H, the chance of a collision between x and y is at most 1/m  for (x != y)

We are storing a set of n keys into a hash table of size m.
If the keys are drawn from a universe U with |U| >= nm, then U has a subset of n keys that all hash to the same slot so that the worst-case searching time for hashing with chaining is n.
In particular, we consider the following Universal Hash Function for a given number of keys, say n.

Choose the size of hash table to be m = n.
Let all possible keys be between 0 and mn-1, inclusively.
That is, U = {0,1,2, ... , mn-1}
Choose a "smallest" prime number p that is larger than mn-1.
Choose table size m ≥ n (n is the number of keys)
Randomly choose two integers a, b, such that 1 <= a <= p -1, and 0 <= b <= p -1
ha,b(k) = ((a∗k+b) % p) % m
Suppose key adversary chose to attack a particular hash function hi,j,(k) for a=i, and b=j
Find out a set of adversary keys Si,j with size=n such that hi,j(k) will hash to a fixed number for all keys k in Si,j .
