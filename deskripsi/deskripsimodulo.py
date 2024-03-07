def modular_pow(base, exponent, modulus):
    if modulus == 1:
        return 0
    result = 1
    base = base % modulus

    while exponent > 0:
        if exponent % 2 == 1:
            result = (result * base) % modulus
        exponent = exponent >> 1
        base = (base * base) % modulus

    return result

basis = 1302
pangkat = 1813
modulus = 2579

hasil = modular_pow(basis, pangkat, modulus)

print("Hasil:", hasil)