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

basis = 949
pangkat = 1321
multiplier = 73
modulus = 2579

# Hitung basis^pangkat % modulus
hasil1 = modular_pow(basis, pangkat, modulus)

# Hitung hasil1 * multiplier % modulus
hasil2 = (hasil1 * multiplier) % modulus

print("Hasil akhir:", hasil2) 