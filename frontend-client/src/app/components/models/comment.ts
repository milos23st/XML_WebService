export class Comment {
  constructor(
    public sadrzaj: string,
    public odobren: boolean,
    public naz: string,
    public id?: string
  ) {}
}
