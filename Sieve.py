def sieve(n):
    flag_list = [True]*(n+1)
    flag_list[0] = flag_list[1] = False
    prime_list=[]

    for i, flag in enumerate(flag_list):
        if flag:
            prime_list.append(i)
            for j in range(2*i, n+1, i):
                flag_list[j] = False
    return prime_list


print(len(sieve(10000000)))

