import { Country } from './country';
export class PopulatedPlace {
  constructor(
    public naziv: string,
    public postalCode: string,
    public country: Country,
    public id?: string
  ) { }
}
