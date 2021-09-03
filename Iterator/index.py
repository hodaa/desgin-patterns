
def compute_closest_to_zero(ts):
    if not ts:
        return 0
    else:
        min = ts[0];
        for item in ts:
            if abs(item) < min:
                min = item
            else:
               if(min == -(item)):
                   min =abs(min)

        # Write your code here
        # To debug: print("Debug messages...", file=sys.stderr, flush=True)
        return min




print(compute_closest_to_zero([-5,5]))