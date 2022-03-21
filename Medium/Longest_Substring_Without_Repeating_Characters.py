# Question Body: https://leetcode.com/problems/longest-substring-without-repeating-characters/


def solution(input: str):
    pass


def traverser(input: list):
    max = 1
    counter = 0
    for part in input:
        if len(part) < max:
            continue
        i = 0
        while i < len(part):
            sub = ""
            counter = 0
            j = i
            while j < len(part):
                point = sub.find(part[j])
                if point < 0:
                    sub += part[j]
                    counter += 1
                    j += 1
                else:
                    i = i + point + 1
                    if max < counter:
                        max = counter
                    break

            if j == len(part) - 1:
                break

    return max


def divider(input: str):
    output = []
    i = 0
    collector = ""
    while i < len(input):
        next = input[i + 1] if (i + 1) != len(input) else ""
        collector += input[i]
        if input[i] == next:
            # if i - lastFound > 1:
            if len(collector) > 1:
                output.append(collector)
            collector = ""

        if i == len(input) - 1 and len(collector) > 1:
            output.append(collector)
        i += 1
    return output


# Testing the code
if __name__ == "__main__":
    print(divider("pwwkewiiiiiiii"))
