# Kotlin map Function Unexpected Behavior
This repository demonstrates a subtle bug in Kotlin's `map` function when combined with conditional logic inside the lambda expression.  The issue arises when the lambda modifies the original collection elements based on conditions rather than creating new elements. This behavior can lead to incorrect outputs if not handled appropriately.

## Problem Description
The `map` function in Kotlin is designed to transform each element of a collection into a new element. However, if the lambda expression modifies the original elements instead of creating new ones, the results might differ from what's intuitively expected. This is particularly noticeable when conditions are included in the lambda. 

## Reproduction Steps
1. Clone this repository.
2. Run `bug.kt` file using a Kotlin compiler. 
3. Compare the observed output with the expected output.

## Solution
The provided `bugSolution.kt` file showcases the solution to mitigate the problem. The core of the fix is to ensure that the lambda function returns a *new* value for each element rather than modifying the existing element.